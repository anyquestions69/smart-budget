import { createRouter, createWebHashHistory } from "vue-router";
import MainPage from "./MainPage.vue";
import LoginPage from "./LoginPage.vue";
import RegistrationPage from "./RegistrationPage.vue";
import PersonalCabinet from "./PersonalCabinet.vue";


export default createRouter({
    history: createWebHashHistory(),
    routes: [
        { path: '/home', component: MainPage, alias: "/" },
        { path: '/login', component: LoginPage },
        { path: '/registration', component: RegistrationPage },
        { path: '/personal-cabinet', component: PersonalCabinet },
    ]
});