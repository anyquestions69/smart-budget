<template>
    <nav class="nav">
        <div class="nav__logo">
            <div class="logo__img">
                <router-link to="/">
                    <svg viewBox="0 0 64 64" xmlns="http://www.w3.org/2000/svg">
                        <g id="Twotone">
                        <g id="Color">
                        <g><path d="M33,31A20,20,0,0,1,13,11V5H7A4,4,0,0,0,3,9V41a4,4,0,0,0,4,4H57a4,4,0,0,0,4-4V31Z" style="fill: #cff09e"/><polygon points="39 45 25 45 21 53 43 53 39 45" style="fill: #79bd9a"/><path d="M16,53H48a4,4,0,0,1,4,4v2a0,0,0,0,1,0,0H12a0,0,0,0,1,0,0V57a4,4,0,0,1,4-4Z" style="fill: #79bd9a"/>
                        <path d="M3,39H61a0,0,0,0,1,0,0v2a4,4,0,0,1-4,4H7a4,4,0,0,1-4-4V39A0,0,0,0,1,3,39Z" style="fill: #79bd9a"/>
                        <g><rect height="4" style="fill: #cff09e" width="4" x="29" y="9"/><rect height="4" style="fill: #79bd9a" width="4" x="29" y="17"/><path d="M52,29a6,6,0,0,1-5.986-5.73A1.99,1.99,0,0,0,45,25a6,6,0,0,0,6,6,2,2,0,0,0,2-2,1.905,1.905,0,0,0-.027-.263A1.972,1.972,0,0,1,52,29Z" style="fill: #cff09e"/><path d="M45,16a1.992,1.992,0,0,1-1.82-2.82,2,2,0,1,0,2.64,2.64A1.99,1.99,0,0,1,45,16Z" style="fill: #cff09e"/></g></g></g><g data-name="Stroke Close copy" id="Stroke_Close_copy"><g><path d="M57,4H7A5.006,5.006,0,0,0,2,9V41a5.006,5.006,0,0,0,5,5H23.382l-3,6H16a5.006,5.006,0,0,0-5,5v2a1,1,0,0,0,1,1H52a1,1,0,0,0,1-1V57a5.006,5.006,0,0,0-5-5H43.618l-3-6H57a5.006,5.006,0,0,0,5-5V9A5.006,5.006,0,0,0,57,4ZM7,6H57a3,3,0,0,1,3,3V38H4V9A3,3,0,0,1,7,6ZM51,57v1H13V57a3,3,0,0,1,3-3H48A3,3,0,0,1,51,57Zm-9.618-5H22.618l3-6H38.382ZM60,41a3,3,0,0,1-3,3H7a3,3,0,0,1-3-3V40H60Z" style="fill: #3b8686"/><path d="M40,16h1.184a2.746,2.746,0,0,0,.117.285l-.836.837a1,1,0,1,0,1.414,1.414l.836-.837a2.746,2.746,0,0,0,.285.117V19a1,1,0,0,0,2,0V17.816A3,3,0,0,0,46.816,16H48a1,1,0,0,0,0-2H46.816a2.746,2.746,0,0,0-.117-.285l.836-.837a1,1,0,1,0-1.414-1.414l-.836.837A2.746,2.746,0,0,0,45,12.184V11a1,1,0,0,0-2,0v1.184a2.746,2.746,0,0,0-.285.117l-.836-.837a1,1,0,1,0-1.414,1.414l.836.837a2.746,2.746,0,0,0-.117.285H40a1,1,0,0,0,0,2Zm4,0a1,1,0,1,1,1-1A1,1,0,0,1,44,16Z" style="fill: #3b8686"/><path d="M48,22.184V21a1,1,0,0,0-2,0v1.184a3,3,0,0,0-.744.385l-.758-.436a1,1,0,1,0-1,1.734l.614.353A2.953,2.953,0,0,0,44,25a6.945,6.945,0,0,0,.036.71l-1.278.32A1,1,0,0,0,43,28a.968.968,0,0,0,.243-.03l1.282-.32a6.989,6.989,0,0,0,.878,1.534l-1.109,1.109a1,1,0,1,0,1.414,1.414L46.816,30.6a6.973,6.973,0,0,0,1.535.878l-.321,1.281a1,1,0,0,0,.728,1.213A.968.968,0,0,0,49,34a1,1,0,0,0,.969-.757l.319-1.279A6.964,6.964,0,0,0,51,32a3.018,3.018,0,0,0,.469-.047l.611,1.438A1,1,0,0,0,53,34a.981.981,0,0,0,.391-.08,1,1,0,0,0,.529-1.311l-.689-1.622A2.983,2.983,0,0,0,53.816,30H55a1,1,0,0,0,0-2H53.816a2.994,2.994,0,0,0-.452-.825L53.8,26.6A1,1,0,0,0,52.2,25.4l-.521.689A3.011,3.011,0,0,0,51,26a1,1,0,0,1-1-1,2.953,2.953,0,0,0-.116-.78l.614-.353a1,1,0,0,0-1-1.734l-.758.436A2.984,2.984,0,0,0,48,22.184ZM51,28a1,1,0,0,1,0,2,5.006,5.006,0,0,1-5-5,1,1,0,0,1,2,0A3,3,0,0,0,51,28Z" style="fill: #3b8686"/><circle cx="51" cy="18" r="1" style="fill: #3b8686"/><circle cx="39" cy="24" r="1" style="fill: #3b8686"/><path d="M55.5,22.405a.381.381,0,0,1,.343.073.39.39,0,0,1,.153.314,1,1,0,0,0,2,0,2.4,2.4,0,0,0-2.98-2.328.383.383,0,0,1-.379-.1.387.387,0,0,1-.106-.379A1,1,0,1,0,52.6,19.5,2.4,2.4,0,0,0,55.5,22.405Z" style="fill: #3b8686"/><path d="M39.146,33a1,1,0,0,0,1.731.991,1.917,1.917,0,0,0,.1-1.972,1.8,1.8,0,0,0-1.6-.984,1,1,0,0,0-1.918-.561A1.923,1.923,0,0,0,39.146,33Z" style="fill: #3b8686"/><path d="M7,35H33a1,1,0,0,0,0-2H8V31h2.877a4.994,4.994,0,0,0,4.851-3.787l1.074-4.3a3,3,0,0,1,.414-.937l.288-.431a2.939,2.939,0,0,1,1.475-1.139c.005.07.021.139.021.21v2.4A8.067,8.067,0,0,0,22.9,29.9,7.7,7.7,0,0,0,26.854,31H33a1,1,0,0,0,0-2H30.854a5.685,5.685,0,0,1-2.928-.811l-.162-.1A5.721,5.721,0,0,1,25,23.211a4.987,4.987,0,0,0-4.642-4.978,4.884,4.884,0,0,0-.8-1.084l-.127-.127a4.925,4.925,0,0,0-6.9-.034,4.862,4.862,0,0,0-1.467,3.305l-.005.113a25.885,25.885,0,0,1-1.345,7.307A1.885,1.885,0,0,1,8,28.988V13a1,1,0,0,0-2,0V34A1,1,0,0,0,7,35ZM22.5,21.547a2.989,2.989,0,0,1,.5,1.664,7.725,7.725,0,0,0,2.451,5.607,5.691,5.691,0,0,1-1.526-.629A6.056,6.056,0,0,1,21,23.022v-2.4c0-.077-.019-.15-.022-.227A2.945,2.945,0,0,1,22.5,21.547Zm-9.435-1.064,0-.113a2.884,2.884,0,0,1,.872-1.958,2.918,2.918,0,0,1,4.085.024l.127.127,0,0a4.991,4.991,0,0,0-2.312,1.872l-.288.431a4.989,4.989,0,0,0-.69,1.561l-1.075,4.3a2.99,2.99,0,0,1-2.443,2.233,3.979,3.979,0,0,0,.268-.607A27.933,27.933,0,0,0,13.061,20.483Z" style="fill: #3b8686"/><path d="M29,14h4a1,1,0,0,0,1-1V9a1,1,0,0,0-1-1H29a1,1,0,0,0-1,1v4A1,1,0,0,0,29,14Zm1-4h2v2H30Z" style="fill: #3b8686"/><path d="M29,22h4a1,1,0,0,0,1-1V17a1,1,0,0,0-1-1H29a1,1,0,0,0-1,1v4A1,1,0,0,0,29,22Zm1-4h2v2H30Z" style="fill: #3b8686"/><path d="M22,10h3a1,1,0,0,0,0-2H22a1,1,0,0,0,0,2Z" style="fill: #3b8686"/><path d="M25,12H23a1,1,0,0,0,0,2h2a1,1,0,0,0,0-2Z" style="fill: #3b8686"/></g></g></g>
                    </svg>
                </router-link>
            </div>
            <div class="logo__text">
                <h2>Smart Budget</h2>
                <p>Ваш умный помощник контроля бюджета!</p>
            </div>
        </div>
        <div class="nav__persona">
            <svg height="203.21504mm" id="svg3346" version="1.1" viewBox="0 0 720.00009 720.0533" width="203.20003mm" xmlns="http://www.w3.org/2000/svg" xmlns:cc="http://creativecommons.org/ns#" xmlns:dc="http://purl.org/dc/elements/1.1/" xmlns:inkscape="http://www.inkscape.org/namespaces/inkscape" xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#" xmlns:sodipodi="http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd" xmlns:svg="http://www.w3.org/2000/svg"><defs id="defs3348"/><g id="layer1" transform="translate(810.7444,-103.27822)"><path d="m -450.74436,103.27822 a 360,360.22475 0 0 0 -360.00004,360.22359 360,360.22475 0 0 0 154.52153,295.62817 c 0.42784,-2.6459 0.84645,-5.29479 1.36133,-7.90818 0.73026,-3.70686 1.54775,-7.381 2.44922,-11.01878 0.57227,-2.30924 1.19043,-4.59687 1.83007,-6.87656 -0.49238,1.7998 -0.96348,3.60927 -1.41406,5.42739 -0.90147,3.63777 -1.71896,7.31192 -2.44922,11.01877 -0.51488,2.6134 -0.93349,5.26227 -1.36133,7.90817 a 360,360.22475 0 0 0 205.47852,64.59743 360,360.22475 0 0 0 224.78906,-79.02521 c 0.0707,0.32688 0.14224,0.6535 0.2168,0.97906 A 360,360.22475 0 0 0 -90.744326,463.50181 360,360.22475 0 0 0 -450.74436,103.27822 Z" id="path4178" style="fill:#ff0000;fill-rule:evenodd;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"/><ellipse cx="-450.74435" cy="448.30341" id="path3362" rx="168.57143" ry="162.85715" style="fill:#1a1a1a;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"/><path d="m -530.67755,815.78368 c -12.00501,-2.68354 -32.68104,-8.73134 -45.94673,-13.43956 -24.53258,-8.70704 -75.77772,-34.80916 -87.28411,-44.45886 -6.24607,-5.23819 -6.26133,-5.5471 -1.0978,-22.2133 18.12855,-58.51308 63.62983,-108.34295 122.00749,-133.61418 35.34389,-15.30011 60.36368,-19.84775 100.02446,-18.18065 76.03111,3.19591 141.37223,41.76341 181.42914,107.08825 10.85103,17.69589 24.77326,53.79281 24.51415,63.55913 -0.10791,4.0629 -6.04907,9.27676 -19.66818,17.26015 -44.20804,25.91434 -95.47457,43.49982 -145.19163,49.80371 -31.02123,3.93335 -98.91194,0.87337 -128.78679,-5.80468 z" id="path4180" style="fill:#1a1a1a;fill-opacity:1"/><rect height="36.95702" id="rect4182" ry="18.47851" style="fill:#1a1a1a;fill-opacity:1" transform="matrix(0.76356839,0.64572696,-0.65192184,0.75828617,0,0)" width="384.71426" x="-173.64436" y="851.85315"/><rect height="122.18182" id="rect4207" ry="45.758362" style="fill:#fbecd6;fill-opacity:1" width="247.27271" x="-574.38074" y="389.91382"/><ellipse cx="-498.29483" cy="452.45923" id="ellipse4213" rx="18.90909" ry="23.272726" style="fill:#1a1a1a;fill-opacity:1"/><ellipse cx="-405.20395" cy="452.45923" id="ellipse4247" rx="18.90909" ry="23.272726" style="fill:#1a1a1a;fill-opacity:1"/></g></svg>
            <div class="persone__information">
                <p>Fallen Angel</p>
            </div>
        </div>
        <ul class="nav__links">
            <li>
                <router-link to="/">Главная</router-link>
            </li>
            <li>
                <router-link to="/login">Выход</router-link>
            </li>
        </ul>
    </nav>
</template>

<script>
export default {}
</script>

<style lang="scss" scoped>
.nav {
    width: 100%;
    height: 100px;
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;

    .nav__logo {
        display: flex;
        flex-direction: row;
        justify-content: start;
        width: 50%;

        .logo__img {
            width: 80px;
            height: 80px;
            margin-right: 20px;
            cursor: pointer;
        };

        .logo__text {

            h2 {
                font-size: 35px;
                font-weight: 600;
            };

            p {
                font-size: 20px;
            };
        };
    };

    .nav__persona {
        display: flex;
        flex-direction: row;
        justify-content: end;
        align-items: center;
        width: 25%;

        svg {
            width: 50px;
            height: 50px;
            margin-right: 30px;
        }

        p {
            height: 30px;
        }
    };

    .nav__links {
        list-style: none;
        width: 25%;
        display: flex;
        flex-direction: row;
        justify-content: end;

        li {
            font-size: 18px;
            border: 2px solid white;
            padding: 4px 10px;
            border-radius: 5px;
            transition: all 0.5s ease;

            &:not(:last-of-type) {
                margin-right: 30px;
            };

            &:hover {
                scale: 1.08;
                transform: translateX(7px) translateY(-4px);
            };
        };
    };
};
</style>