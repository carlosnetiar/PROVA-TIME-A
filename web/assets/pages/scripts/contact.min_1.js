var Contact=function(){return{init:function(){var n;$(document).ready(function(){n=new GMaps({div:"#gmapbg",lat:-13.004333,lng:-38.494333});var t=n.addMarker({lat:-13.004333,lng:-38.494333,title:"Loop, Inc.",infoWindow:{content:"<b>Metronic, Inc.</b> 795 Park Ave, Suite 120<br>San Francisco, CA 94107"}});t.infoWindow.open(n,t)})}}}();jQuery(document).ready(function(){Contact.init()});