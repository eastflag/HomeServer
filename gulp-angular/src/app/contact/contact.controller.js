(function() {
  'use strict';

  angular
    .module('gulpAngular')
    .controller('ContactController', ContactController);

  /** @ngInject */
  function ContactController($cordovaImagePicker) {
    var self = this;

    self.collection = {
      selectedImage : ''
    };
    self.getImageSaveContact = getImageSaveContact;

    function getImageSaveContact() {
      // Image picker will load images according to these settings
      var options = {
        maximumImagesCount: 1, // Max number of selected images, I'm using only one for this example
        width: 800,
        height: 800,
        quality: 80            // Higher is better
      };

      $cordovaImagePicker.getPictures(options).then(function (results) {
        // Loop through acquired images
        for (var i = 0; i < results.length; i++) {
          console.log('Image URI: ' + results[i]);   // Print image URI
          self.collection.selectedImage = results[i];   // We loading only one image so we can use it like this
        }
      }, function(error) {
        console.log('Error: ' + JSON.stringify(error));    // In case of error
      });
    };

  }
})();
