import SwiftUI
import shared

struct ContentView: View {
	let greeting = Greeting()
    let language = Language()

    	@State var greet = "Loading..."

    	func load() {
            greeting.getDogList(completionHandler: { result, error in
                if let result = result {
                    self.greet = result.message.description()
                } else if let error = error {
                    greet = "Error: \(error)"
                }
            })
        }

    	var body: some View {
    		Text(greet).onAppear() {
                load()
            }
    	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
