function showTime() 
{
        var t = null;
        t = setTimeout(time, 1000);//開始运行
        function time() {
            clearTimeout(t);//清除定时器
            dt = new Date();
            var year = dt.getFullYear();
            var month = dt.getMonth() + 1;//(0-11,0代表1月)
            var date = dt.getDate();//获取天
            var num = dt.getDay();//获取星期
            var weekday = ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"];
            var hour = dt.getHours();//获取时
            var minute = dt.getMinutes();//获取分
            var second = dt.getSeconds();//获取秒
            //分秒时间是一位数字，在数字前补0。
            date = extra(date);
            month = extra(month);
            minute = extra(minute);
            second = extra(second);
            document.edit.showtime.value = year + " 年 " + month + " 月 " + date + " 日 " + hour + "：" + minute + "：" + second + " " + weekday[num];
            t = setTimeout(time, 1000); //设定定时器，循环运行
        }
}
//补位函数。
function extra(x) {
        //如果传入数字小于10，数字前补一位0。
        if (x < 10) {
            return "0" + x;
        }
        else {
            return x;
        }
}