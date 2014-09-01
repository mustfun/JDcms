// update info by cropping (onChange and onSelect events handler)
function clearInfo() {
    $('.info #w').val('');
    $('.info #h').val('');
};

function fileSelectHandler() {
    // get selected file
    var oFile = $('#applogo')[0].files[0];
	
    // hide all errors
    $('.error').hide();

    // check for image type (jpg and png are allowed)
    var rFilter = /^(image\/jpeg|image\/png)$/i;
    if (! rFilter.test(oFile.type)) {
        $('.error').html('Please select a valid image file (jpg and png are allowed)').show();
        return;
    }
	
    // check for file size
    if (oFile.size > 1024 * 1024) {
       $('.error').html('You have selected too big file, please select a one smaller image file').show();
        return;
    }

    // preview element
    var oImage = document.getElementById('preview');
	
    // prepare HTML5 FileReader
    var oReader = new FileReader();
        oReader.onload = function(e) {

        // e.target.result contains the DataURL which we can use as a source of the image
        oImage.src = e.target.result;
        oImage.onload = function () { // onload event handler

        };
    };

    // read selected file as DataURL
    oReader.readAsDataURL(oFile);
}

function senSelectHandler() {
    // get selected file
    var oFile = $('#appjietu')[0].files[0];
	
    // hide all errors
    $('.error').hide();

    // check for image type (jpg and png are allowed)
    var rFilter = /^(image\/jpeg|image\/png)$/i;
    if (! rFilter.test(oFile.type)) {
        $('.error').html('Please select a valid image file (jpg and png are allowed)').show();
        return;
    }
	
    // check for file size
    if (oFile.size > 1024 * 1024) {
       $('.error').html('You have selected too big file, please select a one smaller image file').show();
        return;
    }

    // preview element
    var oImage = document.getElementById('preview2');
	
    // prepare HTML5 FileReader
    var oReader = new FileReader();
        oReader.onload = function(e) {

        // e.target.result contains the DataURL which we can use as a source of the image
        oImage.src = e.target.result;
        oImage.onload = function () { // onload event handler

        };
    };

    // read selected file as DataURL
    oReader.readAsDataURL(oFile);
}