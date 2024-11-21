<script setup>
  import {useRouter} from "vue-router"
  import {ref} from "vue"
  const router = useRouter()
  function showList(){
    router.push({"path":"/list"})
  }
  let myPath = ref("")
  function goMyPage(){
    router.push(myPath.value)
  }

  function showDetail(id,language){
    router.push(`/showDetail/${id}/${language}`)
  } 
  
  function showDetail2(id,language){
    router.push(`/showDetail2?id=1&language=java`)
  }

</script>

<template>
<div>
   <router-link to="/showDetail/1/java">声明式路由传参</router-link><br>
   <button @click="showDetail(2,'PHP')">编程式路由传参</button>
   <hr>
   <router-link to="/showDetail2?id=1&language=java">声明式键值对传参</router-link><br>
   <button @click="showDetail(3,'Python')">编程式路由传参</button>
   <!-- <router-link to="/update">update</router-link><br>
   <router-link to="/list">list</router-link><br>
   <router-link to="/home">home</router-link><br>
   <button @click="showList()">list</button>
   <button @click="goMyPage()">Go</button><input type="text" v-model="myPath"> -->

   <router-view></router-view><br>

   // 编程式路由
 </div>
</template>

<style scoped>

</style>
