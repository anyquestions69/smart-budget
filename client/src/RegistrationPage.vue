<template>
    <div>
        <Navigation />
        <RegForm />
        <Footer />
    </div>
</template>

<script>
import Navigation from './components/Navigation.vue';
import RegForm from './components/RegForm.vue';
import Footer from './components/Footer.vue';

export default {
    components: { Navigation, RegForm, Footer }
}</script>

<style lang="scss">

</style>