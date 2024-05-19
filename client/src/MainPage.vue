<template>
    <div>
        <Navigation />
        <Info />
        <Footer />
    </div>
</template>

<script>
import Navigation from './components/Navigation.vue';
import Footer from './components/Footer.vue';
import Info from './components/Info.vue';

export default {
    components: { Navigation, Info, Footer }
}
</script>

<style lang="scss">

</style>