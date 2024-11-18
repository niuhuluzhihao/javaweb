<script setup>
    import {defineEmits} from "vue"

    // 发送到app.vue
    const emits = defineEmits(["sendMenu"])

    function send(data){
        emits("sendMenu",data)
    }

</script>

<template>
   <div>
        <ul>
            <li @click="send('学员管理')">学员管理</li>
            <li @click="send('图书管理')">图书管理</li>
            <li @click="send('请假管理')">请假管理</li>
            <li @click="send('考试管理')">考试管理</li>
            <li @click="send('班级管理')">班级管理</li>
            <li @click="send('教师管理')">教师管理</li>
        </ul>
    </div>
</template>

<style scoped>

</style>
