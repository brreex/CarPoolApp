/**
 * 
 */
index =0;
stop = false;
$(function(){
	"use strict";
    $(window).scroll(function ()
        {
              if($(document).height() <= $(window).scrollTop() + $(window).height())
              {
				  /*alert('sci');*/
                  if(stop!==true){
					   loadmore();
				  }
              }
        });
    
	$(document).ajaxStart(function(){
		$('#loader').css('display','inline');
	});
	
	$(document).ajaxStop(function(){
		$('#loader').css('display','none');
	});
	loadUserPost();
	
	//intervalCheck();
});

function loadUserPost(){
	"use strict";
	let id = $('#userid').val();
	$.ajax({
			'url':'http://localhost:8080/CarPoolWebService/Services/PostService/userpost?userId='+id+'',
			'success':ajaxSuccess,
			'error':ajaxFailure
	 	   });
	/*
    	$.ajax({
			'url':'http://localhost:8080/CarPoolWebService/Services/PostService/posts?type=1',
			'success':givingSuccess,
			'error':ajaxFailure
	 	   });
    
    	$.ajax({
			'url':'http://localhost:8080/CarPoolWebService/Services/PostService/posts?type=2',
			'success':askingSuccess,
			'error':ajaxFailure
	 	   });
		$.ajax({
			'url':'http://localhost:8080/CarPoolWebService/Services/PostService/count'
	 	   }).done(function(jsonData){
			 initrow = jsonData;
		});*/
	
}

function loadmore(){
    "use strict";
    let id = $('#userid').val();
	alert(id);
    index = index+2;
    if(stop!=true){
       	$.ajax({
			'url':'http://localhost:8080/CarPoolWebService/Services/PostService/loadmore?userId='+id+'&index='+index+'',
			'success':ajaxSuccess,
			'error':ajaxFailure
	 	   }); 
    }
}

function ajaxSuccess(jsonData){
	"use strict";
    if(jsonData.length!==0){
        stop =false;
         if(index==0){
                index = 5;
            }
    else{
        index = index+jsonData.length;
    }
	let allpost = jsonData;
	for(let post of allpost){
		let user = post.user;
		let allcomments = post.comment;
        let allikes = post.like;
        /* alert(allikes.length); */
		$('.mypost .owner').append('<h2>Post</h2>');
		$('.mypost .owner').append('<p>'+user.firstName+'</p>');
		$('.mypost .owner').append('<p>'+user.email+'</p>');
		$('.mypost .owner').append('<p>'+post.postText+'</p>');
        $('.mypost .owner').append('<input name="like" id="like" type="submit" value="'+allikes.length+' likes">');
        $('.mypost .owner').append('<input name="comment" id="comment" type="submit" value="'+allcomments.length+' comment">');
		$('.mypost.owner').append('<br>');
		$('.mypost.owner').append('<h2>Comments</h2>');
		$('.mypost.owner').append('<br>');
		
		for(let comment of allcomments){
			let user = comment.user;
			if(user!==null){
				$('.mypost .comments').append('<p>'+user.firstName+'</p>');
				$('.mypost .comments').append('<p>'+user.email+'</p>');
				$('.mypost .comments').append('<p>'+comment.comment+'</p>');
				$('.mypost .comments').append('<br>');
			}
		}
	}
    }
    else{
        stop =true;
    }
   
}

function givingSuccess(jsonData){
	"use strict";
    if(jsonData.length!==0){
        stop=false;
         if(index==0){
                index = 5;
            }
    else{
        index = index+jsonData.length;
    }
	let allpost = jsonData;
	for(let post of allpost){
		let user = post.user;
		let allcomments = post.comment;
        let allikes = post.like;
       /* alert(allikes.length);*/
		$('.givingpost .owner').append('<h2>Post</h2>');
		$('.givingpost .owner').append('<p>'+user.firstName+'</p>');
		$('.givingpost .owner').append('<p>'+user.email+'</p>');
		$('.givingpost .owner').append('<p>'+post.postText+'</p>');
        $('.givingpost .owner').append('<input name="like" id="like" type="submit" value="'+allikes.length+' likes">');
        $('.givingpost .owner').append('<input name="comment" id="comment" type="submit" value="'+allcomments.length+' comment">');
		$('.givingpost.owner').append('<br>');
		$('.givingpost.owner').append('<h2>Comments</h2>');
		$('.givingpost.owner').append('<br>');
		
		for(let comment of allcomments){
			let user = comment.user;
			if(user!==null){
				$('.givingpost .comments').append('<p>'+user.firstName+'</p>');
				$('.givingpost .comments').append('<p>'+user.email+'</p>');
				$('.givingpost .comments').append('<p>'+comment.comment+'</p>');
				$('.givingpost .comments').append('<br>');
			}
		}
	}
    }
    else{
        stop =true;
    }
}

function askingSuccess(jsonData){
	"use strict";
    if(jsonData.length!==0){
        stop =false;
         if(index==0){
                index = 5;
            }
    else{
        index = index+jsonData.length;
    }
	let allpost = jsonData;
	for(let post of allpost){
		let user = post.user;
		let allcomments = post.comment;
        let allikes = post.like;
        /*alert(allikes.length);*/
		$('.askingpost .owner').append('<h2>Post</h2>');
		$('.askingpost .owner').append('<p>'+user.firstName+'</p>');
		$('.askingpost .owner').append('<p>'+user.email+'</p>');
		$('.askingpost .owner').append('<p>'+post.postText+'</p>');
        $('.askingpost .owner').append('<input name="like" id="like" type="submit" value="'+allikes.length+' likes">');
        $('.askingpost .owner').append('<input name="comment" id="comment" type="submit" value="'+allcomments.length+' comment">');
		$('.askingpost.owner').append('<br>');
		$('.askingpost.owner').append('<h2>Comments</h2>');
		$('.askingpost.owner').append('<br>');
		
		for(let comment of allcomments){
			let user = comment.user;
			if(user!==null){
				$('.askingpost .comments').append('<p>'+user.firstName+'</p>');
				$('.askingpost .comments').append('<p>'+user.email+'</p>');
				$('.askingpost .comments').append('<p>'+comment.comment+'</p>');
				$('.askingpost .comments').append('<br>');
			}
		}
	 }
    }
    else{
        stop =true;
    }
}

function ajaxFailure(xhr, status, exception) {
	    "use strict";
		alert('failure to fetch data');
  		console.log(xhr, status, exception);
}
/*
function  checkRowCount(){
	"use strict";
       $.ajax({ url:'http://172.17.4.101:8080/CarPoolWebService/Services/PostService/count',
                type:'GET'
       }
       ).done( function (data){
                let jsdat=null;
                jsdat=JSON.parse(data);
                notify(jsdat[0]);
       }).fail();
}

function notify(currentrow){
 "use strict";
let diff= currentrow-initrow;
  if(diff>0){
$("#eg").css("background-color","red").css("position","relative")
   .css("top","-20px").css("left","-5px").text(diff);
  }
  // $("<span>").addClass("badge badge-notify").css("background-color","red").css("position","relative")
  // .css("top","-20px").css("left","-5px").text("3").appendTo($("#not"));
  //alert(3);
  // $("<p>").text("3dfadaadfaf").appendTo($("#not"));
}

function intervalCheck(){
	"use strict";
     clearfunc= setInterval(checkRowCount,2000);
  }*/
