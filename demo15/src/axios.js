import  axios from "axios"


const instance = axios.create({
    baseURL:"",
    timeout:""
})


// 设置请求的拦截器
instance.interceptors.request.use(
    (config)=>{
        config.headers.Accept=""
        return  config
    },
    
    
    error=>
    {
        console.log("the error")
        return Promise.reject("something wrong")
    })

    
// 设置响应的拦截器
instance.interceptors.response.use(
    function(response){
        console.log("response fail:")
        return response
    },
    function(error){
        console.log("response fail")
        return Promise.reject("something ")
    })


export default instance