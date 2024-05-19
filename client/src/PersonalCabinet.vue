<template>
    <div>
        <NavigationPersonalCabinet />
        <Banks />
        <Entering_Expenses />
        <DiagramBlok />
        <DigitRuble />
        <Footer />
    </div>
</template>

<script>
import NavigationPersonalCabinet from './components/NavigationPersonalCabinet.vue';
import Banks from './components/Banks.vue';
import Entering_Expenses from './components/Entering_Expenses.vue';
import DiagramBlok from './components/DiagramBlok.vue';
import DigitRuble from './components/DigitRuble.vue';
import Footer from './components/Footer.vue';


export default {
    components: { NavigationPersonalCabinet, Banks, Entering_Expenses, DiagramBlok, DigitRuble, Footer }
}
</script>

<style lang="scss">

</style>