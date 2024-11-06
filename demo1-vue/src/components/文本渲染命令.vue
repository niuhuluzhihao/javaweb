<script setup>
/*
v-text识别不了带有html格式的文本
*/
 let msg = "hello vue3"
 /*
 支持字符串模板
 */ 
let haha = "haha"
let msg2 = `hello ${haha}`
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
<h1 v-text ="msg"></h1>
<h1 v-text ="msg2"></h1>
/*支持常见运算符*/ 
<h1 v-text ="age>=18?'成年':'未成年'"></h1>
/*支持常见api调用*/ 
<h1 v-text ="bee.split(' ')"></h1>
/*支持函数调用*/ 
<h1 v-text ="getMsg()"></h1>







  
</div>
</template>

<style scoped>


</style>
