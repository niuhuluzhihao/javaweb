<script setup>
/*
单项绑定 v-bind 响应式数据发生变化的时候，更新dom树，用户的操作如何造成页面内容的改变不会影响响应式数据
双向绑定， v-model由于用户操作发生变化，也会同步修改对应的响应式数据
  双向绑定都用于表单标签

    v-model:value
*/
  import {ref,reactive} from "vue"
  let message = ref("zhangsan")


  let user = reactive(
    {username:"",
    userPwd:"",
    intro:"",
    pro:""}
  )

  let hbs = ref([])

  function clearForm(){
    user.username=""
    user.userPwd=""
    user.intro=""
    user.pro=""
    hbs.value.splice(0,hbs.value.length)
  }



</script>

<template>
<div>
  <input type="text" v-model="user.name"> <br>
  <input type="paasword" v-model="user.userPwd"> <br>
  爱好：
  唱 <input type="checkbox" v-model="hbs" value = "sing">
  跳 <input type="checkbox" v-model="hbs" value="dance">
  rap <input type="checkbox" v-model="hbs" value = "rap">
  <br>
  简介
  <textarea v-model = "user.intro"></textarea>
  <br>
  籍贯
  <select v-model = "user.pro">
    <option value="1">江苏</option>
    <option value ="2">江西</option>
  </select>

  <button @click="clearForm">
    清空表单
  </button>

  <br>
  {{user}}
   <br>
  {{hbs}}
  

</div>
</template>

<style scoped>

</style>
