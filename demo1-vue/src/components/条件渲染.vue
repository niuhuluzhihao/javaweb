<script setup>
/*
v-if:表达式或者数据，数据为true的时候，则当前元素渲染进入dom树
v-else：自动和前面一个v-if做取反操作，否则不展示

*/
  import {ref} from "vue"
  let flag = ref(true)
</script>

<template>
<div>
  <h1 id ="ha" v-if="flag">vue is awesome!</h1>
  <h1 id = "hb" v-else>oh no</h1>
  <h1 id = "hc" v-show="flag">hhhhh</h1>
  <button @click="flag = !flag">toggle</button>

</div>
</template>

<style scoped>


</style>
