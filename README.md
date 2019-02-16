
# react-native-testlibrary

## Getting started

`$ npm install react-native-testlibrary --save`

### Mostly automatic installation

`$ react-native link react-native-testlibrary`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-testlibrary` and add `RNTestlibrary.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNTestlibrary.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.xforce.testlibrary.RNTestlibraryPackage;` to the imports at the top of the file
  - Add `new RNTestlibraryPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-testlibrary'
  	project(':react-native-testlibrary').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-testlibrary/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-testlibrary')
  	```


## Usage
```javascript
import RNTestlibrary from 'react-native-testlibrary';

// TODO: What to do with the module?
RNTestlibrary;
```
  