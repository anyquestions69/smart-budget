<template>
    <div class="logForm">
        <h1>Вход в систему:</h1>
        <form class="logForm__form"  @submit.prevent="loginUser">
            <label for="user_email" class="label">Введите почту:</label>
            <input type="email" id="user_email" name="user_email" placeholder="email" v-model="user_email">
            <div class="error_user_email error" v-show="user_email === '' && clicked">*Неверная почта!</div>
            <label for="user_pass">Введите пароль:</label>
            <input type="password" id="user_pass" name="user_pass" placeholder="password" v-model="user_pass">
            <div class="error_user_password error"  v-show="user_pass === '' && clicked">*Слабый пароль!</div>
            <button type="button" @click="getData">Войти</button>
        </form>
    </div>
</template>

<script>
import axios from 'axios';

export default {
    data() {
        return {
            user_email: '',
            user_pass: '',
            clicked: false
        }
    },
    methods: {
        getData() {
            this.clicked = true;
        },
        async loginUser() {
            if (this.user_email >= 4 && this.user_pass >= 5) {
                try {
                const response = await axios.post('http://localhost:8080/wallet/register', {
                    'email': this.user_email,
                    'password': this.user_pass
                });
                
                this.user_name = '';
                this.user_email = '';
                this.user_pass = '';

                if (response.status === 200) {
                    console.log('Login successful');
                    this.$router.push('/personal-cabinet');
                }
                } catch (error) {
                    console.error("Registration failed:", error);
                }
            }
        }
    },
}
</script>

<style lang="scss" scoped>
$mainColor: rgb(212, 211, 211);

.logForm {
    width: 100%;
    height: 75lvh;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;

    .logForm__form {
        width: 600px;
        padding: 50px 30px;
        border-radius: 5px;
        color: $mainColor;

        label {
            display: block;
            margin-bottom: 10px;
            font-size: 20px;

            &:not(:first-of-type) {
                margin-top: 20px;
            };
        };

        input {
            width: 100%;
            height: 30px;
            margin-top: 5px;
            outline: none;
            padding: 5px 10px;
            font-size: 17px;
            border-radius: 5px;
        };

        button {
            padding: 7px 15px;
            cursor: pointer;
            color: rgb(75, 75, 75);
            border-radius: 4px;
            margin-top: 30px;
            background: rgb(122, 255, 122);
            transition: all 0.5s ease;

            &:hover {
                scale: 1.08;
                transform: translateX(7px) translateY(-4px);
            }
        };

        .error {
            color: rgb(224, 67, 67);
            margin-top: 7px;
            margin-bottom: 14px;
        }
    };
};
</style>