import {createRouter,createWebHashHistory} from "vue-router"
import Home from "../components/Home.vue"
import List from "../components/List.vue"
import add from "../components/add.vue"
import update from "../components/update.vue"

const router = createRouter({
    history:createWebHashHistory(),
    // 用于定义不同的路径和组件之间的对应关系
    routes:[
        {
            path:"/home",
            component:Home
        },
        {path:"/list",
        component:List},
        {path:"/add",
        component:add},
        {path:"/update",
        component:update},
        {path:"/",
        component:update},
        {path:"/showAll",
        "redirect":"/list"
        }
    ]

})


// 暴露router
export default router
