
const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./item');


class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {items: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/item'}).done(response => {
			this.setState({items: response.entity._embedded.items});
		});
	}

	render() { (3)
		return (
			<ItemsList items={this.state.items}/>
		)
	}
}


class EmployeeList extends React.Component {
	render() {
		const items = this.props.items.map(item =>
			<Item key={item._links.self.href} item={item}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Nom</th>
						<th>Description</th>
                        <th>Golds</th>
                        <th>Type</th>
					</tr>
					{items}
				</tbody>
			</table>
		)
	}
}

class Item extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.item.name}</td>
				<td>{this.props.item.description}</td>
				<td>{this.props.item.goldValue}</td>
				<td>{this.props.item.type}</td>
			</tr>
		)
	}
}

ReactDOM.render( <App />, document.getElementById('react') )