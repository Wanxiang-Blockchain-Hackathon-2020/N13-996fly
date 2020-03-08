import Vue from 'vue';
import Router from 'vue-router';

Vue.use(Router);

const routes = [
  {
    name: 'name',
    path:'*',
    component: () => import('./view/name'),
    meta: {
      title: '首页'
    }
  },
  {
    name: 'name/certificate',
    component: () => import('./view/name/certificate'),
    meta: {
      title: '个人信息卡展示'
    }
  },
  {
    name: 'name/register',
    component: () => import('./view/name/register'),
    meta: {
      title: '输入信息'
    }
  },
  {
    name: 'warrant',
    component: () => import('./view/warrant'),
    meta: {
      title: '凭证欢迎页'
    }
  },
  {
    name: 'warrant/list',
    component: () => import('./view/warrant/list'),
    meta: {
      title: '凭证列表'
    }
  },
  {
    name: 'warrant/towarrant',
    component: () => import('./view/warrant/towarrant'),
    meta: {
      title: '凭证授权页'
    }
  },
  {
    name: 'confirm',
    component: () => import('./view/confirm'),
    meta: {
      title: 'confirm'
    }
  },
  {
    name: 'confirm/list',
    component: () => import('./view/confirm/list'),
    meta: {
      title: '授权第三方验证'
    }
  },
  {
    name: 'confirm/end',
    component: () => import('./view/confirm/end'),
    meta: {
      title: '结束'
    }
  }
];

// add route path
routes.forEach(route => {
  route.path = route.path || '/' + (route.name || '');
});

const router = new Router({
  // history模式
  mode: 'history',
  routes 
});

router.beforeEach((to, from, next) => {
  const title = to.meta && to.meta.title;
  if (title) {
    document.title = title;
  }
  next();
});

export {
  router
};
