$(function() {
	//Parsley Form Validation
    //While the JS is not usually required in Parsley, we will be modifying
    //the default classes so it plays well with Bootstrap
    $('#validate-form').parsley({
        successClass: 'has-success',
        errorClass: 'has-error',
        errors: {
            classHandler: function(el) {
                return $(el).closest('.validate-block');
            },
            errorsWrapper: '<ul class=\"help-block list-unstyled\"></ul>',
            errorElem: '<li></li>'
        },
	    messages: {
            defaultMessage: "此栏填写似乎不合格式。",
            type: {
                email: "请填写正确的 Email 格式。",
                url: "请填写正确的 URL。",
                urlstrict: "请填写正确的 URL。",
                number: "请填写数字。",
                digits: "请填写数字。",
                dateIso: "请按年-月-日 (YYYY-MM-DD) 的格式填写。",
                alphanum: "请填写字母。",
                phone: "请填写正确的电话号码。"
            },
            notnull: "此栏不能留空。",
            notblank: "此栏不能留空。",
            required: "此栏不能留空。",
            regexp: "此栏填写似乎不合格式。",
            min: "此栏的值必须大于等于 %s。",
            max: "此栏的值必须小于等于 %s。",
            range: "此栏的值必须介于 %s 和 %s 之间。",
            minlength: "输入过少，必须输入 %s 个以上字符。",
            maxlength: "输入过多，必须输入 %s 个以下字符。",
            rangelength: "输入的长度不正确，必须介于 %s 与 %s 个字符之间。",
            mincheck: "必须至少选择 %s 项。",
            maxcheck: "最多选择 %s 项。",
            rangecheck: "You must select between %s and %s choices.",
            equalto: "输入必须相同。"
        }
    });
    $('#validate-form_en').parsley({
        successClass: 'has-success',
        errorClass: 'has-error',
        errors: {
            classHandler: function(el) {
                return $(el).closest('.validate-block');
            },
            errorsWrapper: '<ul class=\"help-block list-unstyled\"></ul>',
            errorElem: '<li></li>'
        },
	    messages: {
            defaultMessage: "This column fill out doesn't seem format。",
            type: {
                email: "Please fill in the correct Email format。",
                url: "Please fill in the correct URL。",
                urlstrict: "Please fill in the correct URL。",
                number: "Please fill in the Numbers 。",
                digits: "Please fill in the Numbers。",
                dateIso: "Please press the year - month - day (YYYY - MM - DD) format to fill in 。",
                alphanum: "Please fill in the letter 。",
                phone: "Please fill in the correct phone number 。"
            },
            notnull: "This field cannot be left blank 。",
            notblank: "This field cannot be left blank 。",
            required: "This field cannot be left blank 。",
            regexp: "This field cannot be left blank 。",
            min: "This column value must be greater than or equal to %s 。",
            max: "This column value must be greater than or equal to %s 。",
            range: "This column's value must be between % s and %s。",
            minlength: "Too few input must input more than %s characters 。",
            maxlength: "Too much input, must enter the following characters into %s 。",
            rangelength: "The length of the input is not correct, must be between %s to %s characters 。",
            mincheck: "Must select at least %s 。",
            maxcheck: "Most choose to %s 。",
            rangecheck: "You must select between %s and %s choices.",
            equalto: "Input must be the same。"
        }
    });
});