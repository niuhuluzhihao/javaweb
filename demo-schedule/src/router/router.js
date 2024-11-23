import {createRouter,createWebHashHistory} from "vue-router"
import Header from "../components/Header.vue"
import Login from "../components/Login.vue"
import ShowSchedule from "../components/ShowSchedule.vue"
import Regist from "../components/Regist.vue"

const router = createRouter({
    history:createWebHashHistory(),
    // 用于定义不同的路径和组件之间的对应关系
    routes:[
        {
            path:"/header",
            component:Header
        },
        {path:"/",
        component:ShowSchedule},
        {path:"/login",
        component:Login},
        {path:"/ShowSchedule",
        component:ShowSchedule},
        {path:"/Regist",
        component:Regist}
    ]


    

})

// 上一个页面   下一个页面  next 放行的方法

router.beforeEach((to,from,next)=>{
    if (to.path=="/login"){
        next()
    }else{
        const username = sessionStorage.getItem("username")
        if( null !=username){
            next()
        }else{
            next("/login")
        }
    }
})


// 暴露router
export default router
