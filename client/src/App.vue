<template>
    <div class="wrapper">
        <div class="container">
            <router-view></router-view>
        </div>
    </div>
</template>

<script></script>

<style lang="scss">
$mainColor: #232222;
$textColor: #fff;
$additionColor: #25ab75;

@import url('https://fonts.googleapis.com/css2?family=Ubuntu+Sans+Mono:ital,wght@0,400..700;1,400..700&display=swap');


::selection {
    background: $additionColor;
};

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
};

body {
    background: $mainColor;
    color: $textColor;
    font-family: "Ubuntu Sans Mono", monospace;
    font-optical-sizing: auto;
    font-weight: 400;
    font-style: normal;
};

a {
    text-decoration: none;
    color: #c2c2c2;

    &:hover {
        color: #c5e2e1;
    };
};

.wrapper {
    overflow: hidden;
};

.container {
    @media(min-width: 1500px) {
        width: 1300px;
        margin: 0 auto;
    };

    @media(max-width: 1500px) and (min-width: 900px) {
        width: 80%;
        margin: 0 10%;
    };

    @media(max-width: 900px) {
        width: 90%;
        margin: 0 5%;
    };
}
</style>