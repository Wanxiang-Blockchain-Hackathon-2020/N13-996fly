<template>
  <div class="welcome">
      <van-overlay :show="show" >
        <div class="wrapper" >
          <div class="block" >
              <van-form @submit="toLogin" class="row">
                  <van-field
                    v-model="username"
                    name="用户名"
                    label="用户名"
                    placeholder="用户名"
                    :rules="[{ required: true, message: '请填写用户名' }]"
                  />
                  <van-field
                    v-model="password"
                    type="password"
                    name="密码"
                    label="密码"
                    placeholder="密码"
                    :rules="[{ required: true, message: '请填写密码' }]"
                  />
                  <van-row class="row">
                    <van-col span="12" >
                      <van-button  type="info" block @click="toRegister">注册</van-button>
                    </van-col>
                    <van-col span="12" >
                      <van-button  type="primary" block native-type="submit">登录</van-button>
                    </van-col>
                  </van-row>
                </van-form>
          </div>
        </div>
      </van-overlay>
  </div>
</template>

<script>
import { 
  Overlay,
  Row,
  Col,
  Button,
  Field,
  Form
} from "vant";

export default {
  components: {
    [Overlay.name]: Overlay,
    [Row.name]: Row,
    [Col.name]: Col,
    [Button.name]: Button,
    [Field.name]: Field,
    [Form.name]: Form,
  },

  data() {
    return {
      show: true,
      username:'',
      password:'',

      // test
      register:{
        name:'张三',
        tel:19963636363,
        idCard:"5130271971123412345632",
        bumen: '基础架构研发部',
        lingdao: '李四',
      }
    };
  },

  methods: {
    toRegister() {
      this.$router.push({
        name: "name/register",
        params: { userId: "123" }
      });
    },
    toLogin(){
      this.$router.push({
        name: "name/certificate",
        params: { register: this.register }
      });
    }
  }
};
</script>

<style lang="less">
.welcome {
  width: 100%;
  height: 100%;
  display: flex;
  flex-flow: row wrap;
  justify-content: center;
  position: relative;

  .btn-tj {
    position: absolute;
    top: 190%;
    width: 80%;
  }

  .wrapper {
    width: 100%;
    height: 100%;
    display: flex;
    align-items: center;
    justify-content: center;

      .block {
        width: 70%;
        // height: 100em;
        display: flex;
        flex-flow: col nowrap;
        justify-content: center;
        align-items: center;
        display: block;

        color: white;
        .title{
          width: 4em;
          height: 4em;
          font-size: 15px;
          border: 2px white solid;

          box-sizing: border-box;

          display: flex;
          justify-content: center;
          align-items: center;
          margin: 0 auto;

          border-radius: 50%;
          background-color: rgb(25, 137, 250);
        }

        .row{
          text-align: center;
        }
      }
  }

  .van-cell{
    // background-color: rgba(0,0,0,0.7)
  }
} 
</style>
