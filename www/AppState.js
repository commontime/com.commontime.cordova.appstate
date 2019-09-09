/*global cordova, module*/

module.exports = {
    isAppInForeground: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "AppState", "isAppInForeground", []);
    }
};