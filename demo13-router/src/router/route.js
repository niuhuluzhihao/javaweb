import {createRouter,createWebHashHistory} from "vue-router"
import Home from "../components/Home.vue"
import List from "../components/List.vue"
import add from "../components/add.vue"
import update from "../components/update.vue"
import showDetail from "../components/showDetail.vue"
import showDetail2 from "../components/showDetail2.vue"

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
        },
        {path:"/showDetail/:id/:language",
        component:showDetail
        }, {path:"/showDetail2",
        component:showDetail2
        }
    ]


    

})

// 上一个页面   下一个页面  next 放行的方法

router.beforeEach((to,from,next)=>{
    console.log("before")
    console.log(from.path)
    console.log(to.path)
    next()

})


router.beforeEach((to,from)=>{
    console.log("after")
    next()

})

// 暴露router
export default router
