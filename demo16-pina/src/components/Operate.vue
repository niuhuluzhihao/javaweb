<script setup>
import {definePerson} from "../store/store.js"
let person = definePerson()
</script>

<template>
<div>
    <h1>用于修改pina数据</h1>
    <hr>
    名字：<input type ="text" v-model="person.username">
    年龄：<input type ="text" v-model="person.age">
    爱好：
        <input type="checkbox" value = "吃饭" v-model = "person.hobbies">
        <input type="checkbox" value = "跳舞" v-model = "person.hobbies">
        <input type="checkbox" value = "唱歌" v-model = "person.hobbies">
    <hr>
    展示一下person的数据:{{person}}
    <br>
    <button @click="person.doubleAge()">年龄加倍</button>
    <button @click="person.$reset()">恢复属性</button>

</div>

</template>

<style scoped>

</style>
