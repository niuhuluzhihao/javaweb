<script setup>
/*
v-text识别不了带有html格式的文本
v-bind：href 可以不使用v-bind直接：href就可以了
v-on:事件名 @事件名
*/
import { ref } from 'vue';

  function fun(){
    alert("hi")
  }

  let counter = ref(1)
  function fun1(){
    counter.value++
  }

  function fun3(){
    alert("链接被点击了")
  }

  function fun4(){
    alert("链接被点击了")
  }
</script>

<template>
<div>
  <button v-on:click="fun()">hello</button>
  <button v-on:click="fun1()">+</button>
  <button v-on:click="counter++">+</button>
  <button v-on:click.once="counter++">+</button>
  {{counter}}

  <br>
  <a href = "https://www.baidu.com/" v-on：click="fun3()"> 百度</a>
    <a href = "https://www.baidu.com/" v-on：click.prevent="fun3()"> 百度</a>



</div>
</template>

<style scoped>


</style>
