var TableDatatablesManaged=function(){var e=function(){var e=$("#sample_1");e.dataTable({language:{aria:{sortAscending:": activate to sort column ascending",sortDescending:": activate to sort column descending"},emptyTable:"No data available in table",info:"Showing _START_ to _END_ of _TOTAL_ records",infoEmpty:"No records found",infoFiltered:"(filtered1 from _MAX_ total records)",lengthMenu:"Show _MENU_",search:"Search:",zeroRecords:"No matching records found",paginate:{previous:"Prev",next:"Next",last:"Last",first:"First"}},bStateSave:!0,columnDefs:[{targets:0,orderable:!1,searchable:!1}],lengthMenu:[[5,15,20,-1],[5,15,20,"All"]],pageLength:5,pagingType:"bootstrap_full_number",columnDefs:[{orderable:!1,targets:[0]},{searchable:!1,targets:[0]}],order:[[1,"asc"]]});jQuery("#sample_1_wrapper");e.find(".group-checkable").change(function(){var e=jQuery(this).attr("data-set"),a=jQuery(this).is(":checked");jQuery(e).each(function(){a?($(this).prop("checked",!0),$(this).parents("tr").addClass("active")):($(this).prop("checked",!1),$(this).parents("tr").removeClass("active"))}),jQuery.uniform.update(e)}),e.on("change","tbody tr .checkboxes",function(){$(this).parents("tr").toggleClass("active")})},a=function(){var e=$("#sample_2");e.dataTable({language:{aria:{sortAscending:": activate to sort column ascending",sortDescending:": activate to sort column descending"},emptyTable:"No data available in table",info:"Showing _START_ to _END_ of _TOTAL_ records",infoEmpty:"No records found",infoFiltered:"(filtered1 from _MAX_ total records)",lengthMenu:"Show _MENU_",search:"Search:",zeroRecords:"No matching records found",paginate:{previous:"Prev",next:"Next",last:"Last",first:"First"}},bStateSave:!0,pagingType:"bootstrap_extended",lengthMenu:[[5,15,20,-1],[5,15,20,"All"]],pageLength:5,columnDefs:[{orderable:!1,targets:[0]},{searchable:!1,targets:[0]}],order:[[1,"asc"]]});jQuery("#sample_2_wrapper");e.find(".group-checkable").change(function(){var e=jQuery(this).attr("data-set"),a=jQuery(this).is(":checked");jQuery(e).each(function(){a?$(this).prop("checked",!0):$(this).prop("checked",!1)}),jQuery.uniform.update(e)})},t=function(){var e=$("#sample_3");e.dataTable({language:{aria:{sortAscending:": activate to sort column ascending",sortDescending:": activate to sort column descending"},emptyTable:"No data available in table",info:"Showing _START_ to _END_ of _TOTAL_ records",infoEmpty:"No records found",infoFiltered:"(filtered1 from _MAX_ total records)",lengthMenu:"Show _MENU_",search:"Search:",zeroRecords:"No matching records found",paginate:{previous:"Prev",next:"Next",last:"Last",first:"First"}},bStateSave:!0,lengthMenu:[[6,15,20,-1],[6,15,20,"All"]],pageLength:6,columnDefs:[{orderable:!1,targets:[0]},{searchable:!1,targets:[0]}],order:[[1,"asc"]]});jQuery("#sample_3_wrapper");e.find(".group-checkable").change(function(){var e=jQuery(this).attr("data-set"),a=jQuery(this).is(":checked");jQuery(e).each(function(){a?$(this).prop("checked",!0):$(this).prop("checked",!1)}),jQuery.uniform.update(e)})};return{init:function(){jQuery().dataTable&&(e(),a(),t())}}}();App.isAngularJsApp()===!1&&jQuery(document).ready(function(){TableDatatablesManaged.init()});