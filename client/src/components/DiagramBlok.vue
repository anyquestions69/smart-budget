<template>
    <div class="diagrams">
        <div class="diagrams__chart">
            <canvas id="statistic_chart"></canvas>
        </div>
        <div class="vertical_line"></div>
        <div class="diagrams__circle">
            <canvas id="statistic_circle"></canvas>
        </div>
    </div>
</template>

<script>
import Chart from 'chart.js/auto';

export default {
    name: 'Diagrams',
    mounted() {
        let ctx = document.getElementById('statistic_chart');

        new Chart(ctx, {
            type: 'bar',
            data: {
                labels: ['Январь', 'Февраль', 'Март', 'Апрель', 'Май', 'Июнь', 'Июль', 'Август', 'Сентябрь', 'Октябрь', 'Ноябрь', 'Декабрь'],
                datasets: [{
                    label: 'Статистика расходов!',
                    data: [12300, 23124, 2423, 45000, 12343, 23454, 12452, 4563, 134534, 134523, 13453, 67564],
                    background: [
                        'white'
                    ],
                    borderColor: [
                    "#FF0000", // Красный
                    "#00FF00", // Зеленый
                    "#0000FF", // Синий
                    "#FFFF00", // Желтый
                    "#00FFFF", // Голубой
                    "#FF00FF", // Розовый
                    "#800000", // Бордовый
                    "#008000", // Оливковый
                    "#000080", // Навыночный
                    "#808000", // Коричневый
                    "#800080", // Фиолетовый
                    "#C0C0C0"  // Серебряный
                    ],
                    borderWidth: 4
                }],
            },
            options: {},
        })


        let ctx_2 = document.getElementById('statistic_circle');
        
        const data = {
            labels: [
                'Eating',
                'Drinking',
                'Sleeping',
                'Designing',
                'Coding',
                'Cycling',
                'Running'
            ],
            datasets: [{
                label: 'My First Dataset',
                data: [65, 59, 90, 81, 56, 55, 40],
                fill: true,
                backgroundColor: 'rgba(255, 99, 132, 0.2)',
                borderColor: 'rgb(255, 99, 132)',
                pointBackgroundColor: 'rgb(255, 99, 132)',
                pointBorderColor: '#fff',
                pointHoverBackgroundColor: '#fff',
                pointHoverBorderColor: 'rgb(255, 99, 132)'
            }, {
                label: 'My Second Dataset',
                data: [28, 48, 40, 19, 96, 27, 100],
                fill: true,
                backgroundColor: 'rgba(54, 162, 235, 0.2)',
                borderColor: 'rgb(54, 162, 235)',
                pointBackgroundColor: 'rgb(54, 162, 235)',
                pointBorderColor: '#fff',
                pointHoverBackgroundColor: '#fff',
                pointHoverBorderColor: 'rgb(54, 162, 235)'
            }]
        };

        const config = {
        type: 'radar',
        data: data,
        options: {
            elements: {
            line: {
                borderWidth: 3
            }
            }
        },
        };

        new Chart(ctx_2, config);
    }
}
</script>

<style lang="scss" scoped>
.diagrams {
    width: 100%;
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;
    height: 500px;
    margin-top: 50px;

    .diagrams__chart {
        width: 65%;
    }
    
    .vertical_line {
        width: 3px;
        background: black;
        border: 2px solid black;
        height: 100%;
        border-radius: 5px;
    }

    .diagrams__circle {
        width: 33%;
    }
}
</style>