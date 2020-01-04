module.exports = {
    outputDir: 'public',
     devServer: {
        open: process.platform === 'vue',
        host: '0.0.0.0',
        port: 80,
        https: false,
        hotOnly: false,
        proxy: { // 设置代理
            '/api': {
                target: 'http://113.119.134.145:8888/',
                changeOrigin: true,
                pathRewrite: {
                    '^/api': '/'
                }
            }
        },
        disableHostCheck: true
    }
    }