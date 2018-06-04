$(function(){
    
    $('#nav > ul > li').hover(function(){
        $(this).children('.subnav').show();
    } , function(){
        $(this).children('.subnav').hide();
    });
    
    if(_site.topcid == '0'){
        var $navli = $('#nav').find('li[data-model='+_site.model+']');
    }else{
        var $navli = $('#nav').find('li[data-cid='+_site.topcid+']');
        $navli = $navli.length > 0 ? $navli : $('#nav').find('li[data-model='+_site.model+']');
    }
    
    if($navli.length === 0){
    
    }else{
        $navli.addClass('current');
    }
    
    
    var $totop = $('<div/>').hide().appendTo('body').html('<i class="iconfont icon-packup"></i>').addClass('totop').click(function(){
        $('html,body').animate({
            scrollTop: 0
        },500);
    });
    
    $(document).scroll(function(){
        if($(document).scrollTop() > 100){
            $totop.show();
        }else{
            $totop.hide();
        }
    });
    
    
    $('#search-btn').on('click' , function(){
        var k = $.trim($('#search-wd').val());
        if(k === ''){
            $('#search-wd').focus();
            return false;
        }else{
            window.location.href = _site.serarch_url.replace('all//' , 'all/' + encodeURIComponent(k)+'/');
        }
    });
    
    $('#search-wd').on('keypress' , function(event){
        if(event.keyCode == '13'){
            $('#search-btn').click();
        }
    });
    
    
    $('#block-left').css('minHeight' , function(){
        var value = $('#block-left').outerHeight();
        var height = $('#block-right').outerHeight();
        return value > height ? value : height + 10;
    });
    
    
    setInfoHits();
    setPlayer();
    
    
    function setInfoHits(){
        var url = window.location.href;
        if(url.indexOf('/show/') > 0){
            var arr = url.split('/show/')[1].split('/');
            if(arr.length > 1){
                $.getJSON('/?s=home/api/hits/model/'+arr[0]+'/id/'+(~~arr[1]));
            }
        }
    }
    
    function setPlayer(){
        var url = window.location.href;
        if(url.indexOf('/show/video/') > 0){
            var $player = $('#player-box');
            var url = $player.data('url');
            if(url.indexOf('youku.com') > 0 && url.indexOf('/id_') > 0){
                //var vid = url.split('/id_')[1].split('.')[0];
                var code = '<iframe height="100%" width="100%" style="display:block; position: relative;" src="//player.baodai.org/ipsign/player.php?v='+url+'" frameborder="0" allowfullscreen></iframe>';
                $player.html(code);
                /*
                $('#player-box').html('<div id="flashswf"></div>');
                swfobject.embedSWF("https://player.youku.com/player.php/sid/"+vid+"/v.swf", "flashswf" , "100%" , "100%" , "9.0.0" , "" , {} , {
                    allowfullscreen: "true",
                    wmode: "window",
                    allowFullScreenInteractive: "true"
                });
                */
                
            }else if(url.indexOf('live.qq.com') > 0 && url.indexOf('/v/') > 0){

                var vid = url.split('/v/')[1].split('?')[0];
                $.ajax({
                    url: "/public/geturl/index.php?site=qqlive&show=json&id="+vid,
                    dataType: "json",
                    success: function(res){
                        $player.html('');
                        var player = new Clappr.Player({source: res[0].url , parentId: "#player-box" , width: '100%' , height: '100%'});
                    },
                    error: function(){
                        $player.find('.tip').html('<a href="'+url+'" target="_blank" style="color:#fff;">鍥犵増鏉冮檺鍒�,鐐规璁块棶鑵捐瀹樼綉鎾斁!</a>');
                    }
                });
            }else if(url.indexOf('v.ums.uc.cn') > 0){
                $player.html('<a href="'+url+'" target="_blank" style="display: block; width:100%; height:400px; line-height:400px; text-align: center; font-size:86px; color:#999;"><i class="iconfont icon-playon"></i></a>');
            }else if(url.indexOf('weibo.com') > 0){
                var vid = url.split('?fid=')[1].split('&')[0];
                $.ajax({
                    url: "/public/geturl/index.php?site=weibo&show=json&id="+vid,
                    dataType: "json",
                    success: function(res){
                        $player.html('');
                        var player = new Clappr.Player({source: res[0].url , parentId: "#player-box" , width: '100%' , height: '100%'});
                    },
                    error: function(){
                        $player.find('.tip').html('<a href="'+url+'" target="_blank" style="color:#fff;">鍥犵増鏉冮檺鍒�,鐐规璁块棶寰崥瀹樼綉鎾斁!</a>');
                    }
                });
            }else{
                $player.find('.tip').html('鍔犺浇澶辫触');
            }
        }
    }
    
    
});