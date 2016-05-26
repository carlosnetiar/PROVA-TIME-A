AmCharts.translations.dataLoader={},AmCharts.addInitHandler(function(a){function e(b,d,g,h){void 0===h&&(h="dataProvider"),g.showCurtain&&l(void 0,g.noStyles),c.remaining++,AmCharts.loadFile(b,g,function(i){if(!1===i)n(g.error,g,a),k(AmCharts.__("Error loading the file",a.language)+": "+b,!1,g);else{switch(void 0===g.format&&(g.format="json"),g.format=g.format.toLowerCase(),g.format){case"json":if(d[h]=AmCharts.parseJSON(i),!1===d[h])return n(g.error,g,a),k(AmCharts.__("Error parsing JSON file",a.language)+": "+c.url,!1,g),d[h]=[],void 0;d[h]=f(d[h],g),n(g.load,g,a);break;case"csv":if(d[h]=AmCharts.parseCSV(i,g),!1===d[h])return n(g.error,g,a),k(AmCharts.__("Error parsing CSV file",a.language)+": "+c.url,!1,g),d[h]=[],void 0;d[h]=f(d[h],g),n(g.load,g,a);break;default:return n(g.error,g,a),k(AmCharts.__("Unsupported data format",a.language)+": "+g.format,!1,g.noStyles),void 0}if(c.remaining--,0===c.remaining){if(n(g.complete,a),g.async)if("map"===a.type)a.validateNow(!0);else if(a.validateData(),"pie"===a.type&&void 0!==a.invalidateSize&&a.invalidateSize(),c.startDuration)if("stock"===a.type){a.panelsSettings.startDuration=c.startDuration;for(var j=0;j<a.panels.length;j++)a.panels[j].startDuration=c.startDuration,a.panels[j].animateAgain()}else a.startDuration=c.startDuration,void 0!==a.animateAgain&&a.animateAgain();"stock"!==a.type||g.reloading||void 0===a.periodSelector||a.periodSelector.setDefaultPeriod(),m()}g.reload&&(g.timeout&&clearTimeout(g.timeout),g.timeout=setTimeout(e,1e3*g.reload,b,d,g),g.reloading=!0)}})}function f(b,d){if(void 0===d.postProcess||!h(d.postProcess))return b;try{return d.postProcess.call(c,b,d,a)}catch(e){return k(AmCharts.__("Error loading file",a.language)+": "+d.url,!1,d),b}}function g(a){return"object"==typeof a}function h(a){return"function"==typeof a}function i(a){for(var b in d)d.hasOwnProperty(b)&&j(a,b,d[b])}function j(a,b,c){void 0===a[b]&&(a[b]=c)}function k(a,b,c){c.showErrors?l(a,c.noStyles):(m(),console.log(a))}function l(b,d){m(),void 0===b&&(b=AmCharts.__("Loading data...",a.language));var e=document.createElement("div");if(e.setAttribute("id",a.div.id+"-curtain"),e.className="amcharts-dataloader-curtain",!0!==d){e.style.position="absolute",e.style.top=0,e.style.left=0,e.style.width=(void 0!==a.realWidth?a.realWidth:a.divRealWidth)+"px",e.style.height=(void 0!==a.realHeight?a.realHeight:a.divRealHeight)+"px",e.style.textAlign="center",e.style.display="table",e.style.fontSize="20px";try{e.style.background="rgba(255, 255, 255, 0.3)"}catch(f){e.style.background="rgb(255, 255, 255)"}e.innerHTML='<div style="display: table-cell; vertical-align: middle;">'+b+"</div>"}else e.innerHTML=b;a.containerDiv.appendChild(e),c.curtain=e}function m(){try{void 0!==c.curtain&&a.containerDiv.removeChild(c.curtain)}catch(b){}c.curtain=void 0}function n(a,b,d,e){"function"==typeof a&&a.call(c,b,d,e)}void 0!==a.dataLoader&&g(a.dataLoader)||(a.dataLoader={});var b=a.version.split(".");if(!(Number(b[0])<3||3===Number(b[0])&&Number(b[1])<13)){var c=a.dataLoader;c.remaining=0;var d={async:!0,format:"json",showErrors:!0,showCurtain:!0,noStyles:!1,reload:0,timestamp:!1,delimiter:",",skip:0,useColumnNames:!1,reverse:!1,reloading:!1,complete:!1,error:!1,headers:[],chart:a};c.loadData=function(){if("stock"===a.type)setTimeout(function(){0>a.panelsSettings.startDuration&&(c.startDuration=a.panelsSettings.startDuration,a.panelsSettings.startDuration=0);for(var b=0;b<a.dataSets.length;b++){var d=a.dataSets[b];void 0!==d.dataLoader&&void 0!==d.dataLoader.url&&(d.dataProvider=[],i(d.dataLoader),e(d.dataLoader.url,d,d.dataLoader,"dataProvider")),void 0!==d.eventDataLoader&&void 0!==d.eventDataLoader.url&&(d.events=[],i(d.eventDataLoader),e(d.eventDataLoader.url,d,d.eventDataLoader,"stockEvents"))}},100);else{if(i(c),void 0===c.url)return;void 0!==a.startDuration&&0<a.startDuration&&(c.startDuration=a.startDuration,a.startDuration=0),"gauge"===a.type?(void 0===a.arrows&&(a.arrows=[]),e(c.url,a,c,"arrows")):(void 0===a.dataProvider&&(a.dataProvider="map"===a.type?{}:[]),e(c.url,a,c,"dataProvider"))}},c.loadData()}},["pie","serial","xy","funnel","radar","gauge","gantt","stock","map"]),void 0===AmCharts.__&&(AmCharts.__=function(a,b){return void 0!==b&&void 0!==AmCharts.translations.dataLoader[b]&&void 0!==AmCharts.translations.dataLoader[b][a]?AmCharts.translations.dataLoader[b][a]:a}),AmCharts.loadFile=function(a,b,c){var d;d=window.XMLHttpRequest?new XMLHttpRequest:new ActiveXObject("Microsoft.XMLHTTP");try{d.open("GET",b.timestamp?AmCharts.timestampUrl(a):a,b.async)}catch(e){c.call(this,!1)}if(b.headers.length)for(var f=0;f<b.headers.length;f++){var g=b.headers[f];d.setRequestHeader(g.key,g.value)}d.onreadystatechange=function(){4===d.readyState&&404===d.status?c.call(this,!1):4===d.readyState&&200===d.status&&c.call(this,d.responseText)};try{d.send()}catch(e){c.call(this,!1)}},AmCharts.parseJSON=function(response){try{return void 0!==JSON?JSON.parse(response):eval(response)}catch(e){return!1}},AmCharts.parseCSV=function(a,b){var f,g,c=AmCharts.CSVToArray(a,b.delimiter),d=[],e=[];if(b.useColumnNames){e=c.shift();for(var h=0;h<e.length;h++)f=e[h].replace(/^\s+|\s+$/gm,""),""===f&&(f="col"+h),e[h]=f;0<b.skip&&b.skip--}for(g=0;g<b.skip;g++)c.shift();for(var i;i=b.reverse?c.pop():c.shift();){var j={};for(g=0;g<i.length;g++)f=void 0===e[g]?"col"+g:e[g],j[f]=i[g];d.push(j)}return d},AmCharts.CSVToArray=function(a,b){b=b||",";for(var c=new RegExp("(\\"+b+"|\\r?\\n|\\r|^)"+'(?:"([^"]*(?:""[^"]*)*)"|'+'([^"\\'+b+"\\r\\n]*))","gi"),d=[[]],e=null;e=c.exec(a);){var f=e[1];f.length&&f!==b&&d.push([]);var g;g=e[2]?e[2].replace(new RegExp('""',"g"),'"'):e[3],d[d.length-1].push(g)}return d},AmCharts.timestampUrl=function(a){var b=a.split("?");return 1===b.length?b[1]=(new Date).getTime():b[1]+="&"+(new Date).getTime(),b.join("?")};