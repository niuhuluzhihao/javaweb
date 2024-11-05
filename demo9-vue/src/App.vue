<script setup>
  import {ref} from "vue"
      // 定义要展示到html的一些数据、


      // 响应式和非响应式
      // 响应式数据：在数据变化时候，vue框架会将变量最新的值更新到dom树中，页面数据是实时更新的
      // 非响应数据： 不会更新到dom树中，页面数据不是实时更新的

      // vue3中需要使用ref、reativate处理一下


      let counter = ref(10)  //{value:10}   --在script标签中需要使用value,但是在template中不需要value
    // 加1
      function counterInc(){
        counter.value++
      }
      function counterDecr(){
        counter.value--
      }
      function showcounter(){
        alert(counter)
      }

</script>

<template>
<div>
  <button @click="counterInc">+</button>
  <span v-text="counter"></span>
  <button @click="counterDecrc">-</button>
  <button @click="showcounter">showCounter</button>
</div>


</template>

<style scoped>

</style>
