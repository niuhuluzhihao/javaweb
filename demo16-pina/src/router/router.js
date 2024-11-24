import {createRouter,createWebHashHistory} from "vue-router"
import Operate from "../components/Operate.vue"
import List from "../components/List.vue"

const router = createRouter({
    history:createWebHashHistory(),
    // 用于定义不同的路径和组件之间的对应关系
    routes:[
        {
            path:"/list",
            component:List
        },
        {path:"/",
        component:Operate},
        {path:"/operate",
        component:Operate}
    ]


    

})

// 上一个页面   下一个页面  next 放行的方法



// 暴露router
export default router
