var FormValidationMd=function(){var e=function(){var e=$("#form_sample_1"),r=$(".alert-danger",e),i=$(".alert-success",e);e.validate({errorElement:"span",errorClass:"help-block help-block-error",focusInvalid:!1,ignore:"",messages:{payment:{maxlength:jQuery.validator.format("Max {0} items allowed for selection"),minlength:jQuery.validator.format("At least {0} items must be selected")},"checkboxes1[]":{required:"Please check some options",minlength:jQuery.validator.format("At least {0} items must be selected")},"checkboxes2[]":{required:"Please check some options",minlength:jQuery.validator.format("At least {0} items must be selected")}},rules:{name:{minlength:2,required:!0},email:{required:!0,email:!0},email2:{required:!0,email:!0},url:{required:!0,url:!0},url2:{required:!0,url:!0},number:{required:!0,number:!0},number2:{required:!0,number:!0},digits:{required:!0,digits:!0},creditcard:{required:!0,creditcard:!0},delivery:{required:!0},payment:{required:!0,minlength:2,maxlength:4},memo:{required:!0,minlength:10,maxlength:40},"checkboxes1[]":{required:!0,minlength:2},"checkboxes2[]":{required:!0,minlength:3},radio1:{required:!0},radio2:{required:!0}},invalidHandler:function(e,t){i.hide(),r.show(),App.scrollTo(r,-200)},errorPlacement:function(e,r){r.is(":checkbox")?e.insertAfter(r.closest(".md-checkbox-list, .md-checkbox-inline, .checkbox-list, .checkbox-inline")):r.is(":radio")?e.insertAfter(r.closest(".md-radio-list, .md-radio-inline, .radio-list,.radio-inline")):e.insertAfter(r)},highlight:function(e){$(e).closest(".form-group").addClass("has-error")},unhighlight:function(e){$(e).closest(".form-group").removeClass("has-error")},success:function(e){e.closest(".form-group").removeClass("has-error")},submitHandler:function(e){i.show(),r.hide()}})},r=function(){var e=$("#form_sample_2"),r=$(".alert-danger",e),i=$(".alert-success",e);e.validate({errorElement:"span",errorClass:"help-block help-block-error",focusInvalid:!1,ignore:"",messages:{payment:{maxlength:jQuery.validator.format("Max {0} items allowed for selection"),minlength:jQuery.validator.format("At least {0} items must be selected")},"checkboxes1[]":{required:"Please check some options",minlength:jQuery.validator.format("At least {0} items must be selected")},"checkboxes2[]":{required:"Please check some options",minlength:jQuery.validator.format("At least {0} items must be selected")}},rules:{name:{minlength:2,required:!0},email:{required:!0,email:!0},email2:{required:!0,email:!0},url:{required:!0,url:!0},url2:{required:!0,url:!0},number:{required:!0,number:!0},number2:{required:!0,number:!0},digits:{required:!0,digits:!0},creditcard:{required:!0,creditcard:!0},delivery:{required:!0},payment:{required:!0,minlength:2,maxlength:4},memo:{required:!0,minlength:10,maxlength:40},"checkboxes1[]":{required:!0,minlength:2},"checkboxes2[]":{required:!0,minlength:3},radio1:{required:!0},radio2:{required:!0}},invalidHandler:function(e,t){i.hide(),r.show(),App.scrollTo(r,-200)},errorPlacement:function(e,r){r.is(":checkbox")?e.insertAfter(r.closest(".md-checkbox-list, .md-checkbox-inline, .checkbox-list, .checkbox-inline")):r.is(":radio")?e.insertAfter(r.closest(".md-radio-list, .md-radio-inline, .radio-list,.radio-inline")):e.insertAfter(r)},highlight:function(e){$(e).closest(".form-group").addClass("has-error")},unhighlight:function(e){$(e).closest(".form-group").removeClass("has-error")},success:function(e){e.closest(".form-group").removeClass("has-error")},submitHandler:function(e){i.show(),r.hide()}})},i=function(){var e=$("#form_sample_3"),r=$(".alert-danger",e),i=$(".alert-success",e);e.validate({errorElement:"span",errorClass:"help-block help-block-error",focusInvalid:!1,ignore:"",messages:{payment:{maxlength:jQuery.validator.format("Max {0} items allowed for selection"),minlength:jQuery.validator.format("At least {0} items must be selected")},"checkboxes1[]":{required:"Please check some options",minlength:jQuery.validator.format("At least {0} items must be selected")},"checkboxes2[]":{required:"Please check some options",minlength:jQuery.validator.format("At least {0} items must be selected")}},rules:{name:{minlength:2,required:!0},email:{required:!0,email:!0},email2:{required:!0,email:!0},url:{required:!0,url:!0},url2:{required:!0,url:!0},number:{required:!0,number:!0},number2:{required:!0,number:!0},digits:{required:!0,digits:!0},creditcard:{required:!0,creditcard:!0},delivery:{required:!0},payment:{required:!0,minlength:2,maxlength:4},memo:{required:!0,minlength:10,maxlength:40}},invalidHandler:function(e,t){i.hide(),r.show(),App.scrollTo(r,-200)},errorPlacement:function(e,r){r.is(":checkbox")?e.insertAfter(r.closest(".md-checkbox-list, .md-checkbox-inline, .checkbox-list, .checkbox-inline")):r.is(":radio")?e.insertAfter(r.closest(".md-radio-list, .md-radio-inline, .radio-list,.radio-inline")):e.insertAfter(r)},highlight:function(e){$(e).closest(".form-group").addClass("has-error")},unhighlight:function(e){$(e).closest(".form-group").removeClass("has-error")},success:function(e){e.closest(".form-group").removeClass("has-error")},submitHandler:function(e){i.show(),r.hide()}})};return{init:function(){e(),r(),i()}}}();jQuery(document).ready(function(){FormValidationMd.init()});