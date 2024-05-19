const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const CopyPlugin = require('copy-webpack-plugin');
const { VueLoaderPlugin } = require('vue-loader');

module.exports = {
    mode: 'development',
    entry: path.resolve(__dirname, './src/index.js'),
    output: {
        path: path.resolve(__dirname, './dist'),
        filename: 'index.[contenthash].js',
        assetModuleFilename: 'assets/[name][ext]',
        clean: true
    },
    module: {
        rules: [
            {
                test: /\.vue$/,
                use: [
                    {
                        loader: 'vue-loader'
                    }
                ]
            },
            {
                test: /\.scss$/,
                use: [ 'vue-style-loader', 'css-loader', 'sass-loader' ]
            },
            {
                test: /\.(png|jpg|jpeg|gif|svg|ico)$/i,
                type: 'asset/resource'
            },
            {
                test: /\.html$/i,
                use: 'html-loader'
            }
        ]
    },
    devServer: {
        port: 3000,
        compress: true,
        hot: true,
        static: {
            directory: path.join(__dirname, 'dist')
        },
        open: true
    },
    plugins:[
        new HtmlWebpackPlugin({
            template: path.resolve(__dirname, './src/index.html'),
            filename: 'index.html'
        }),  
        new VueLoaderPlugin(),
        new CopyPlugin({
            patterns: [
                { 
                    from: 'src/assets',
                    to: 'assets' 
                }
            ]
        }),
    ]
}