<script setup>
import { ref } from 'vue'
let username = window.sessionStorage.getItem("username")
import {useRouter} from  'vue-router'
let router = useRouter()
function logout(){
    window.sessionStorage.removeItem("username")
    router.push("/login")

}
</script>

<template>
    <div>


    <h1>home页面</h1>
    <h3>欢迎{{username}}登录</h3>
    <button @click="logout()">退出登录</button>

    </div>
  
</template>

<style scoped>

</style>
