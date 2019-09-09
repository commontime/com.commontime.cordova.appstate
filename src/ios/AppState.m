#import "AppState.h"

@implementation AppState

- (void) isAppInForeground: (CDVInvokedUrlCommand*) command
{
    CDVPluginResult* pluginResult;
    
    if ([[UIApplication sharedApplication] applicationState] == UIApplicationStateActive)
    {
        pluginResult = [CDVPluginResult resultWithStatus: CDVCommandStatus_OK messageAsBool:YES];
    }
    else
    {
        pluginResult = [CDVPluginResult resultWithStatus: CDVCommandStatus_OK messageAsBool:NO];
    }
    
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end