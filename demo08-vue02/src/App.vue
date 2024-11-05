 <script setup>
 /*
 在.vue文件中的style文件
 将css文件保存到独立的css文件中，那个.vue文件需要，就在哪里导入
 如果某个样式要在所有的的.vue文件中生效，可以在main.js中导入
 */ 

import "./style/test.css"
</script>

<template>
  <div>
    <span class="s1"> 你好</span>
  
  </div>
</template>

<style scoped>

</style>
