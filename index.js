import React from 'react';
import {AppRegistry, StyleSheet, Text, ScrollView,View} from 'react-native';

class HelloWorld extends React.Component {
  render() {
    return (
      <ScrollView style={styles.container}>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
        <Text style={styles.hello}>Helllllo, ReactNative</Text>
      </ScrollView>
    );
  }
}
var styles = StyleSheet.create({
  container: {
  },
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
});

AppRegistry.registerComponent('MyReactNativeApp', () => HelloWorld);