function validar(dom, tipo) {
    switch (tipo) {
        case'num':
            var regex = /[^0-9]/g;
            break;
        case'text':
            var regex = /\d/g;
            break;
    }
    dom.value = dom.value.replace(regex, '');
}
;

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


