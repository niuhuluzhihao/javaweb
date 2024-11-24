import { createApp } from 'vue'
import router  from "./router/router"
import App from './App.vue'
import { createPinia } from 'pinia'

let pinia = createPinia()



const app = createApp(App)
app.use(router)
app.use(pinia)
app.mount('#app')

