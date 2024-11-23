import { createApp } from 'vue'
import router  from "./routers/router"
import App from './App.vue'

const app = createApp(App)
app.use(router)
app.mount('#app')

