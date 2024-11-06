<script setup>
/*
插值表达式
*/
 let msg = "hello vue3"
 let getMsg=()=>{
   return "Hello vue3 message"
 }
 let age = 10
 let bee = "蜜 蜂"
 let carts = [{name:"可乐",price:3,number:10},{name:"薯片",price:6,number:8}]
 function compute(){
   let count =0
   for(let index in carts){
     count += carts[index].price*carts[index].number
   }
   return count
 }
</script>

<template>
<div>
<h1>{{msg}}</h1>
msg的值是{{getMsg()}}<br>
<!-----支持常见的运算符->
年龄{{age}} 是否成年：{{age >18 ? "是"："否"}}
<!-----支持对象调用----->
{{bee.split(" ").reverse()}}<br>
{{compute()}}

  
</div>
</template>

<style scoped>


</style>
