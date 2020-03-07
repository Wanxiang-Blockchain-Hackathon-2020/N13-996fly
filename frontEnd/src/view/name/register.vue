<template>
  <div class="name">
    <van-field v-model="register.name" type="name" label="姓名" placeholder="请输入用户名"/>
    <!-- 输入手机号，调起手机号键盘 -->
    <van-field v-model="register.tel" type="tel" label="手机号" placeholder="请输入手机号"/>
    <van-field v-model="register.idCard" type="name" label="身份证号" placeholder="请输入身份证号" maxlength="18"/>
    <van-field v-model="register.bumen" type="name" label="所在部门" placeholder="请输入所在部门"/>
    <van-field v-model="register.lingdao" type="name" label="直属领导" placeholder="请输入直属领导"/>
    
    <van-button round class="btn-tj" type="info" block @click="toMyCompany">提交到我的企业</van-button>
  </div>
</template>

<script>
import { 
  Field,
  Button
} from 'vant';
import { DropdownMenu, DropdownItem } from 'vant';

export default {
  components: {
    [Field.name]:Field,
    [Button.name]: Button,
    [DropdownMenu.name]: DropdownMenu,
    [DropdownItem.name]: DropdownItem,
  },

  data() {
    return {
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
    toMyCompany(){

      this.$router.push({ name: 'name/certificate', params: { register: this.register }})
      // this.$router.push({path: '/resourceManagement'})
    }
  }
};
</script>

<style lang="less">
.name {
  width: 100%;
  height: 100%;
  display: flex;
  flex-flow: row wrap;
  justify-content: center;
  position: relative;

  .btn-tj{
    position: absolute;
    top:190%;
    width:80%;
  }
}
</style>
