
var projectName = '摄影跟拍预定管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '摄影跟拍',
	url: './pages/sheyinggenpai/list.html'
}, 
{
	name: '周边商品',
	url: './pages/zhoubianshangpin/list.html'
}, 

{
	name: '公告信息',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot808t0/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除"],"menu":"摄影师","menuJump":"列表","tableName":"sheyingshi"}],"menu":"摄影师管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["新增","查看","修改","删除","查看评论"],"menu":"摄影跟拍","menuJump":"列表","tableName":"sheyinggenpai"}],"menu":"摄影跟拍管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除"],"menu":"类别","menuJump":"列表","tableName":"leibie"}],"menu":"类别管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["新增","查看","修改","删除","查看评论"],"menu":"周边商品","menuJump":"列表","tableName":"zhoubianshangpin"}],"menu":"周边商品管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除"],"menu":"商品类型","menuJump":"列表","tableName":"shangpinleixing"}],"menu":"商品类型管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","删除"],"menu":"跟拍预约","menuJump":"列表","tableName":"genpaiyuyue"}],"menu":"跟拍预约管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","删除"],"menu":"跟拍流程","menuJump":"列表","tableName":"genpailiucheng"}],"menu":"跟拍流程管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","删除"],"menu":"成品信息","menuJump":"列表","tableName":"chengpinxinxi"}],"menu":"成品信息管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","删除","审核"],"menu":"商品订单","menuJump":"列表","tableName":"shangpindingdan"}],"menu":"商品订单管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","删除"],"menu":"评论信息","menuJump":"列表","tableName":"pinglunxinxi"}],"menu":"评论信息管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"},{"appFrontIcon":"cuIcon-copy","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","查看评论","预约"],"menu":"摄影跟拍列表","menuJump":"列表","tableName":"sheyinggenpai"}],"menu":"摄影跟拍模块"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","查看评论","购买"],"menu":"周边商品列表","menuJump":"列表","tableName":"zhoubianshangpin"}],"menu":"周边商品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","修改","删除","支付"],"menu":"跟拍预约","menuJump":"列表","tableName":"genpaiyuyue"}],"menu":"跟拍预约管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","审核"],"menu":"跟拍流程","menuJump":"列表","tableName":"genpailiucheng"}],"menu":"跟拍流程管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","评价","评论"],"menu":"成品信息","menuJump":"列表","tableName":"chengpinxinxi"}],"menu":"成品信息管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改","删除","支付"],"menu":"商品订单","menuJump":"列表","tableName":"shangpindingdan"}],"menu":"商品订单管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改","删除"],"menu":"评论信息","menuJump":"列表","tableName":"pinglunxinxi"}],"menu":"评论信息管理"},{"child":[{"appFrontIcon":"cuIcon-favor","buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","查看评论","预约"],"menu":"摄影跟拍列表","menuJump":"列表","tableName":"sheyinggenpai"}],"menu":"摄影跟拍模块"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","查看评论","购买"],"menu":"周边商品列表","menuJump":"列表","tableName":"zhoubianshangpin"}],"menu":"周边商品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","审核","流程"],"menu":"跟拍预约","menuJump":"列表","tableName":"genpaiyuyue"}],"menu":"跟拍预约管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","修改","删除","成品"],"menu":"跟拍流程","menuJump":"列表","tableName":"genpailiucheng"}],"menu":"跟拍流程管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","修改","删除"],"menu":"成品信息","menuJump":"列表","tableName":"chengpinxinxi"}],"menu":"成品信息管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"商品订单","menuJump":"列表","tableName":"shangpindingdan"}],"menu":"商品订单管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看"],"menu":"评论信息","menuJump":"列表","tableName":"pinglunxinxi"}],"menu":"评论信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","查看评论","预约"],"menu":"摄影跟拍列表","menuJump":"列表","tableName":"sheyinggenpai"}],"menu":"摄影跟拍模块"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","查看评论","购买"],"menu":"周边商品列表","menuJump":"列表","tableName":"zhoubianshangpin"}],"menu":"周边商品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"摄影师","tableName":"sheyingshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
