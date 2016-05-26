$(function () {
    $('.placementTest').inputmask({
        mask: "y/1/2 h:m:s",
        placeholder: "yyyy/mm/dd HH:MM:SS",
        separator: "/",
        alias: "datetime",
        hourFormat: "24"
    });
});
