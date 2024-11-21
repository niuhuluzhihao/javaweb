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
</script>

<template>
<div>
   // 该标签会被替换出具体的.vue
   <router-link to="/add">add</router-link><br>
   <router-link to="/update">update</router-link><br>
   <router-link to="/list">list</router-link><br>
   <router-link to="/home">home</router-link><br>
   <button @click="showList()">list</button>
   <button @click="goMyPage()">Go</button><input type="text" v-model="myPath">

   <router-view></router-view><br>
   // 编程式路由
 </div>
</template>

<style scoped>

</style>
