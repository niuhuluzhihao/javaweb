import {defineStore} from  "pinia"


export const definePerson = defineStore(
    { 
        id:"personPina", // 当前数据的id,必须全局唯一
        state:()=>{
            return {
                username:'zhangsan' ,
                age:0,
                hobbies:['唱歌','跳舞']
            }
            
        },
        getters:{
            getAge(){
                return this.age
            },
            getHobbiesCount(){
                return this.hobbies.length
            }
        },
        actions:{ /// 定义修改函数的参数
            doubleAge(){
                this.age = this.age*2
            } 
        }
        

    }



)