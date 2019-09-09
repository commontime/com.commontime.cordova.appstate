#import <Cordova/CDV.h>

@interface AppState : CDVPlugin

- (void) isAppInForeground:(CDVInvokedUrlCommand*)command;

@end