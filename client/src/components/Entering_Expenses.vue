<template>
    <div class="entering_expenses">
        <h3 class="entering_expenses__logo">Не доверяете автоматической проверке данных?</h3>
        <p class="entering_expenses__text">Введете всё самотоятельно!</p>
        <Transition name="fade">
            <div class="entering_expenses__form" v-show="isOpen">
                <form class="form__info">
                    <div class="form__info_monthes">
                        <label for="month">Выбирите месяц:</label>
                        <select name="month" id="month">
                            <option disabled value="" default>Выберите месяц</option>
                            <option value="январь">Январь</option>
                            <option value="февраль">Февраль</option>
                            <option value="март">Март</option>
                            <option value="апрель">Апрель</option>
                            <option value="май">Май</option>
                            <option value="июнь">Июнь</option>
                            <option value="июль">Июль</option>
                            <option value="август">Август</option>
                            <option value="сентябрь">Сентябрь</option>
                            <option value="октябрь">Октябрь</option>
                            <option value="ноябрь">Ноябрь</option>
                            <option value="декабрь">Декабрь</option>
                        </select>
                    </div>
                    <div class="form__info_income">
                        <label for="user_income">Ваш доход за этот месяц:</label>
                        <input type="text" id="user_income" name="user_income" placeholder="Доход">
                    </div>
                </form>
                <form  class="form__categorical">
                    <h3>Категории расходов:</h3>
                    <div class="form__categorical__info">
                        <p>Здесь пока ничего нет!</p>
                    </div>
                    <div class="form__categorical__instruments">
                        <label for="">Категория:</label>
                        <input type="text" placeholder="категория">
                        <label for="">Сумма:</label>
                        <input type="text" placeholder="сумма">
                        <button>Добавить категорию расхода</button>
                    </div>
                </form>
            </div>
        </Transition>
        <div class="entering_expenses__nav">
            <button class="nav__open" v-if="!isOpen" @click="showForm">
                <p>Окрыть панель</p>
                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512">
                    <path d="M169.4 502.6c12.5 12.5 32.8 12.5 45.3 0l128-128c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L224 402.7 224 32c0-17.7-14.3-32-32-32s-32 14.3-32 32l0 370.7L86.6 329.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l128 128z"/>
                </svg>
            </button>
            <button class="nav__close" v-else @click="showForm">
                <p>Скрыть панель</p>
                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512">
                    <path d="M169.4 502.6c12.5 12.5 32.8 12.5 45.3 0l128-128c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L224 402.7 224 32c0-17.7-14.3-32-32-32s-32 14.3-32 32l0 370.7L86.6 329.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l128 128z"/>
                </svg>
            </button>
        </div>
    </div>
</template>

<script>
export default {
    data () {
        return {
            isOpen: false
        }
    },
    methods: {
        showForm() {
            this.isOpen = !this.isOpen
        }
    }
}
</script>

<style lang="scss" scoped>
.entering_expenses {
    margin-top: 50px;

    .entering_expenses__logo {
        font-size: 30px;
    }

    .entering_expenses__text {
        margin-top: 10px;
        font-size: 20px;
    }

    .entering_expenses__form {
        margin-top: 35px;
        width: 100%;
        display: flex;
        flex-direction: row;
        flex-wrap: wrap;
        justify-content: space-between;

        .form__info {
            display: flex;
            flex-direction: column;
            gap: 25px;
            width: 600px;

            .form__info_monthes {
                width: 100%;
                display: flex;
                flex-direction: row;
                justify-content: space-between;

                label {
                    font-size: 20px;
                }

                select {
                    width: 300px;
                    height: 30px;
                    padding: 4px 10px;
                }
            }

            .form__info_income {
                width: 100%;
                display: flex;
                flex-direction: row;
                justify-content: space-between;

                label {
                    font-size: 20px;
                }

                input {
                    width: 300px;
                    height: 30px;
                    outline: none;
                    padding: 3px 10px;
                }
            }
        }

        .form__categorical {
            width: 670px;
            min-height: 400px;
            padding: 30px;
            box-shadow: inset 5px 5px 4px black;
            border: 2px solid rgb(187, 187, 187);
            border-radius: 10px;

            h3 {
                font-size: 25px;
            }

            .form__categorical__info {
                margin-top: 30px;
            }

            .form__categorical__instruments {
                margin-top: 50px;
                width: 100%;
                display: flex;
                flex-direction: column;
                gap: 15px;

                label {
                    font-size: 20px;
                }

                input {
                    padding: 5px 15px;
                    outline: none;
                }

                button {
                    margin-top: 20px;
                    width: 210px;
                    height: 40px;
                    cursor: pointer;
                    border-radius: 8px;
                    font-size: 13px;
                    background: rgb(60, 135, 60);
                    transition: all 0.5s ease;

                    &:hover {
                        scale: 1.05;
                        transform: translateX(5px) translateY(-3px);
                    }
                }
            }
        }
    }

    .entering_expenses__nav {

        .nav__open {
            width: 200px;
            display: flex;
            flex-direction: row;
            justify-content: space-between;
            align-items: center;
            margin-top: 25px;
            padding: 5px 10px;
            border-radius: 10px;
            cursor: pointer;
            background: rgb(60, 149, 60);
            outline: none;
            transition: all 0.5s ease;

            &:hover {
                scale: 1.08;
                transform: translateX(7px) translateY(-4px);

                p {
                    color: white;
                    transition: all 0.5s ease;
                }

                svg {

                    path {
                        fill: rgb(38, 38, 38);
                    }
                }
            }

            p {
                font-size: 15px;
                color: rgb(171, 171, 171);
            }

            svg {
                width:35px;
                height: 35px;
                transition: all 0.5s ease;

                path {
                    fill: rgb(101, 101, 101);
                    transition: all 0.5s ease;
                }
            }
        }

        .nav__close {
            width: 200px;
            display: flex;
            flex-direction: row;
            justify-content: space-between;
            align-items: center;
            margin-top: 25px;
            padding: 5px 10px;
            border-radius: 10px;
            cursor: pointer;
            background: rgb(170, 61, 80);
            outline: none;
            transition: all 0.5s ease;

            &:hover {
                scale: 1.08;
                transform: translateX(7px) translateY(-4px);

                p {
                    color: white;
                    transition: all 0.5s ease;
                }

                svg {

                    path {
                        fill: rgb(38, 38, 38);
                    }
                }
            }

            p {
                font-size: 15px;
                color: rgb(171, 171, 171);
            }

            svg {
                width:35px;
                height: 35px;
                transition: all 0.5s ease;
                rotate: 180deg;

                path {
                    fill: rgb(101, 101, 101);
                    transition: all 0.5s ease;
                }
            }
        }
    }
}


.fade-enter-active,
.fade-leave-active {
  transition: opacity 0.5s linear;
}

.fade-enter-from,
.fade-leave-to {
  opacity: 0;
}
</style>