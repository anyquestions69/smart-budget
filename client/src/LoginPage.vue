<template>
    <div>
        <Navigation />
        <LogForm />
        <Footer />
    </div>
</template>

<script>
import Navigation from './components/Navigation.vue';
import LogForm from './components/LogForm.vue';
import Footer from './components/Footer.vue';

export default {
    components: { Navigation, LogForm, Footer }
}</script>

<style lang="scss">

</style>