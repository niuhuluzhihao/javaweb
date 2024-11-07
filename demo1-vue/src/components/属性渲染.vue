<script setup>
/*
v-text识别不了带有html格式的文本
v-bind：href 可以不使用v-bind直接：href就可以了
*/

const data = {
  logo:"baidu",
  title:"一个图片",
  url:"https://www.baidu.com/"
}

let imgUrl ="https://tse3-mm.cn.bing.net/th/id/OIP-C.jdP04yEoxG10mcywseQj7gAAAA?rs=1&pid=ImgDetMain"
</script>

<template>
<div>
  <a v-bind:href="data.url">
  <img v-bind:src="imgUrl" v-bind:title = "data.title">

  </a>





  
</div>
</template>

<style scoped>


</style>
